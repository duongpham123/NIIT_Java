package java_niit;

class UserInfo {
    private String userId;
    private String name;
    private String password;
    private double money;

    public UserInfo(String userId, String name, String password, double money) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.money = money;
    }

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void withdraw(int amount) {
        if (amount <= money) {
            money -= amount;
        } else {
            throw new IllegalArgumentException("Số tiền vượt quá số dư tài khoản");
        }
    }
}