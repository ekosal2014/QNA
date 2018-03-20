package Q_AND_A.kh.com.domains;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



/**
 * 
 * @author Mango
 *
 */
public class UserInfo implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user_cd      ;
	private String full_name    ;
	private String user_nickname;
	private String gender       ;
	private String phone        ;
	private String email        ;
	private String address      ;
	private String username     ;
	private String password     ;
	private String createby     ;
	private String createdt     ;
	private String photo        ;
	private String sts          ;
	private String txt          ;
	private String modify_dy    ;
	private String modify_dt    ;
	private String action       ;
	private List<Role> roles  ; 
	
	public UserInfo(){
		this.user_cd       = "";
		this.full_name     = "";
		this.user_nickname = "";
		this.gender        = "";
		this.phone         = "";
		this.email         = "";
		this.address       = "";
		this.username      = "";
		this.password      = "";
		this.createby      = "";
		this.createdt      = "";
		this.photo         = "";
		this.sts           = "";
		this.txt           = "";          
		this.modify_dy     = "";
		this.modify_dt     = "";
		this.action        = "";
		this.roles         = null;
	}
	
	
	public UserInfo(String user_cd, String full_name, String user_nickname, String gender, String phone, String email,
			String address, String username, String password, String createby, String createdt, String photo,
			String sts, String txt, String modify_dy, String modify_dt, String action, List<Role> roles) {
		
		super();
		this.user_cd       = user_cd      ;
		this.full_name     = full_name    ;
		this.user_nickname = user_nickname;
		this.gender        = gender       ;
		this.phone         = phone        ;
		this.email         = email        ;
		this.address       = address      ;
		this.username      = username     ;
		this.password      = password     ;
		this.createby      = createby     ;
		this.createdt      = createdt     ;
		this.photo         = photo        ;
		this.sts           = sts          ;
		this.txt           = txt          ;
		this.modify_dy     = modify_dy    ;
		this.modify_dt     = modify_dt    ;
		this.action        = action       ;
		this.roles         = roles        ;
	}
	
	public String getUser_cd() {
		return user_cd;
	}
	public void setUser_cd(String user_cd) {
		this.user_cd = user_cd;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getCreatedt() {
		return createdt;
	}
	public void setCreatedt(String createdt) {
		this.createdt = createdt;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public String getModify_dy() {
		return modify_dy;
	}
	public void setModify_dy(String modify_dy) {
		this.modify_dy = modify_dy;
	}
	public String getModify_dt() {
		return modify_dt;
	}
	public void setModify_dt(String modify_dt) {
		this.modify_dt = modify_dt;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	

	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return roles;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		if ( sts.equals("1")) {
			return true;
		}
		return false;
	}



	
	
}
