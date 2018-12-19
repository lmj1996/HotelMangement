package com.realm;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import com.pojo.Staff;
import com.service.StaffService;

public class MyRealm extends AuthorizingRealm {

	@Resource(name = "staffService")
	private StaffService staffService;

	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {

		// 获取基于用户名和密码的令牌
		// 实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
		// 两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e
		// UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
		// System.out.println("验证当前Subject时获取到token为" +
		// ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
		Staff staff = staffService.getStaffInfoByNum((String) authcToken.getPrincipal());

		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(staff,
				staff.getStaffPassword(), ByteSource.Util.bytes(staff.getStaffName()), getName());
		this.setSession(staff);
		
		
		return simpleAuthenticationInfo;

		// 此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息
		// 说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)
		// 这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证

		// AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("papio", "papio",
		// this.getName());
		// this.setSession("currentUser", "papio");
		// return authcInfo;

	}
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		// 获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
		//String currentUsername = (String) super.getAvailablePrincipal(principals);
		
		//String key = (String) principals.getPrimaryPrincipal();
		Staff staff = (Staff) principals.getPrimaryPrincipal();
		List<String> roleList = new ArrayList<String>();
		List<String> permissionList = new ArrayList<String>();
		// 从数据库中获取当前登录用户的详细信息
		//Staff staff = staffService.getStaffInfoByNum(key);
		if (staff != null) {
			// 实体类User中包含有用户角色的实体类信息
			// 获取当前登录用户的角色
			// 实体类Role中包含有角色权限的实体类信息
			// 获取权限

			// 超管
			if (staff.getStaffPosition().equals("1000001")) {
				roleList.add("s-administrator");
				roleList.add("room-manager");
				roleList.add("staff-manager");
				roleList.add("stock-manager");
				permissionList.add("room-manager:query");
				permissionList.add("room-manager:add");
				permissionList.add("room-manager:update");
				permissionList.add("room-manager:delete");
				permissionList.add("staff-manager:query");
				permissionList.add("staff-manager:add");
				permissionList.add("staff-manager:update");
				permissionList.add("staff-manager:delete");
				permissionList.add("stock-manager:query");
				permissionList.add("stock-manager:add");
				permissionList.add("stock-manager:update");
				permissionList.add("stock-manager:delete");
			}
			// 总管理
			else if (staff.getStaffPosition().equals("b2cae3e0-3727-48be-b94f-24cf3a05f57b")) {
				roleList.add("total-administrator");
				roleList.add("room-manager");
				roleList.add("staff-manager");
				roleList.add("stock-manager");
				permissionList.add("room-manager:query");
				permissionList.add("room-manager:add");
				permissionList.add("room-manager:update");
				permissionList.add("room-manager:delete");
				permissionList.add("staff-manager:query");
				permissionList.add("staff-manager:add");
				permissionList.add("staff-manager:update");
				permissionList.add("staff-manager:delete");
				permissionList.add("stock-manager:query");
				permissionList.add("stock-manager:add");
				permissionList.add("stock-manager:update");
				permissionList.add("stock-manager:delete");
			}
			// 前台管理员
			else if (staff.getStaffPosition().equals("5027e264-0d30-465f-8c2f-7b3456188340")) {
				roleList.add("room-manager");
				roleList.add("index-checker");
				permissionList.add("room-manager:query");
				permissionList.add("room-manager:update");
			}
			// 前台接待员
			else if (staff.getStaffPosition().equals("98fa7253-2a2a-48f7-8aa4-c4cef91ef991")) {
				roleList.add("room-manager-user");
				permissionList.add("room-manager:query");
				permissionList.add("room-manager:update");
			}
			// 仓库管理
			else if (staff.getStaffPosition().equals("678e8e86-50c8-443a-85d7-b38a5baa6333")) {
				roleList.add("stock-manager");
				permissionList.add("stock-manager:query");
				permissionList.add("stock-manager:add");
				permissionList.add("stock-manager:update");
				permissionList.add("stock-manager:delete");
			}
			// 遍历角色添加权限
			/*if (roleList != null) {
				for (String role : roleList) {
					if (role.equals("room-manager")) {
						permissionList.add("room-manager:query");
						permissionList.add("room-manager:add");
						permissionList.add("room-manager:update");
						permissionList.add("room-manager:delete");
					}
					if (role.equals("staff-manager")) {
						permissionList.add("staff-manager:query");
						permissionList.add("staff-manager:add");
						permissionList.add("staff-manager:update");
						permissionList.add("staff-manager:delete");
					}
					if (role.equals("stock-manager")) {
						permissionList.add("stock-manager:query");
						permissionList.add("stock-manager:add");
						permissionList.add("stock-manager:update");
						permissionList.add("stock-manager:delete");
					}
				}
			}*/
			

		} else {
			throw new AuthorizationException();
		}
		// 为当前用户设置角色和权限
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		simpleAuthorInfo.addRoles(roleList);
		simpleAuthorInfo.addStringPermissions(permissionList);
		
		
		// SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		// 实际中可能会像上面注释的那样从数据库取得
		// if(null!=currentUsername && "papio".equals(currentUsername)){
		// //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色
		// simpleAuthorInfo.addRole("admin");
		// //添加权限
		// simpleAuthorInfo.addStringPermission("admin:manage");
		// System.out.println("已为用户[papio]赋予了[admin]角色和[admin:manage]权限");
		// return simpleAuthorInfo;
		// }else if(null!=currentUsername && "big".equals(currentUsername)){
		// System.out.println("当前用户[big]无授权");
		// return simpleAuthorInfo;
		// }
		// 若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址
		// 详见applicationContext.xml中的<bean id="shiroFilter">的配置

		return simpleAuthorInfo;
	}

	

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			if (null != session) {
				session.setAttribute("currentUser", value);
			}
		}
	}

}
