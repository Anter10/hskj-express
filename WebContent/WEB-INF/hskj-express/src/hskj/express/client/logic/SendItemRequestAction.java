package hskj.express.client.logic;

public class SendItemRequestAction extends SelfAction{
	private String receive_person_id = "";
	private String receive_where_id  = "";
	private String send_person_id    = "";
	private String send_person_where = "";
	
	private String send_person_wheremsg = "";
	private String rec_person_wheremsg  = "";
	private String rec_person_phonemsg  = "";
	private String rec_person_phone2msg = "";
	private String rec_person_name      = "";
	
	public String getRec_person_name() {
		return rec_person_name;
	}
	public void setRec_person_name(String rec_person_name) {
		this.rec_person_name = rec_person_name;
	}
	public String getSend_person_wheremsg() {
		return send_person_wheremsg;
	}
	public void setSend_person_wheremsg(String send_person_wheremsg) {
		this.send_person_wheremsg = send_person_wheremsg;
	}
	public String getRec_person_wheremsg() {
		return rec_person_wheremsg;
	}
	public void setRec_person_wheremsg(String rec_person_wheremsg) {
		this.rec_person_wheremsg = rec_person_wheremsg;
	}
	public String getRec_person_phonemsg() {
		return rec_person_phonemsg;
	}
	public void setRec_person_phonemsg(String rec_person_phonemsg) {
		this.rec_person_phonemsg = rec_person_phonemsg;
	}
	public String getRec_person_phone2msg() {
		return rec_person_phone2msg;
	}
	public void setRec_person_phone2msg(String rec_person_phone2msg) {
		this.rec_person_phone2msg = rec_person_phone2msg;
	}
	public String getReceive_person_id() {
		return receive_person_id;
	}
	public void setReceive_person_id(String receive_person_id) {
		this.receive_person_id = receive_person_id;
	}
	public String getReceive_where_id() {
		return receive_where_id;
	}
	public void setReceive_where_id(String receive_where_id) {
		this.receive_where_id = receive_where_id;
	}
	public String getSend_person_id() {
		return send_person_id;
	}
	public void setSend_person_id(String send_person_id) {
		this.send_person_id = send_person_id;
	}
	public String getSend_person_where() {
		return send_person_where;
	}
	public void setSend_person_where(String send_person_where) {
		this.send_person_where = send_person_where;
	}
	@Override
    public String execute() throws Exception{
		try{
			
			 if(getReceive_person_id().isEmpty() == false && getReceive_where_id().isEmpty() == false && getSend_person_id().isEmpty() == false && getSend_person_where().isEmpty() == false){
				return "SUCCESS";
			 }else{
				return "ERROR";
			 }
		 }catch(Exception  ex){
			 return "ERROR"; 
		 }
		
	}
}
