package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cortina {
	private String sub;
	private String tel;
	private String email;
	private String local;
	private String just;
	private String resp;
	public Cortina(String sub, String tel, String email, String local, String just, String resp) {
		super();
		this.sub = sub;
		this.tel = tel;
		this.email = email;
		this.local = local;
		this.just = just;
		this.resp = resp;
	}
	public Cortina() {
		// TODO Auto-generated constructor stub
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getJust() {
		return just;
	}
	public void setJust(String just) {
		this.just = just;
	}
	public String getResp() {
		return resp;
	}
	public void setResp(String resp) {
		this.resp = resp;
	}
	
	public String toString() {
		return sub+"#"+tel+"#"+email+"#"+local+"#"+just+"#"+resp;
	}
	
	public List<String> validaCortina() {
		ArrayList<String> listaCo = new ArrayList<String>();
		//if (sub.equals("")) {
		//	listaCo.add("Substituição de cortina");
		//}

		if (tel.equals("")) {
			listaCo.add("Telefone");

		}
		if (email.equals("")) {
			listaCo.add("Email");

		}
		if (local.equals("")) {
			listaCo.add("Local");
		}
		
		if(just.equals("")) {
			listaCo.add("Justificativa");
		}
		if (resp.equals("")) {
			listaCo.add("Responsável");
		}
		
		return listaCo;
	}
	
	
}
