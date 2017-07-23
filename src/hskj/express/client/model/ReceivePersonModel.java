package hskj.express.client.model;

public class ReceivePersonModel {
	    private int    id;
	    private String mainid   = "";
	    private String name     = "";
	    private String phone1   = "";
	    private String phone2   = "";
	    private String addtime  = "";
	    
		public String getAddtime() {
			return addtime;
		}
		public void setAddtime(String addtime) {
			this.addtime = addtime;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMainid() {
			return mainid;
		}
		public void setMainid(String mainid) {
			this.mainid = mainid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone1() {
			return phone1;
		}
		public void setPhone1(String phone1) {
			this.phone1 = phone1;
		}
		public String getPhone2() {
			return phone2;
		}
		public void setPhone2(String phone2) {
			this.phone2 = phone2;
		}
		 
}
