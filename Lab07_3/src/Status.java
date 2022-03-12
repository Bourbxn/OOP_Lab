enum Status {
	FRESHMAN,
	SOPHOMORE,
	JUNIOR,
	SENIOR;

	public String getStatus() {
		switch (this) {
			case FRESHMAN:
				return "FRESHMAN";
			case SOPHOMORE:
				return "SOPHOMORE";
			case JUNIOR:
				return "JUNIOR";
			case SENIOR:
				return "SENIOR";
			default:
				return "";
		}
	}
}