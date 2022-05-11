package pojoClasses;

public class SafeRequest {
    //POJO Class
    String safeName;
    String folder;
    String account;
    String password;

    public SafeRequest(String safeName, String folder, String account, String password) {
        this.safeName = safeName;
        this.folder = folder;
        this.account = account;
        this.password = password;
    }

    public SafeRequest() {
        this.safeName = "PRV_PACHOLSKI";
        this.folder = "Root";
        this.account = "pacholski";
        this.password = "ADpass1234$";
    }

    public String getSafeName() {
        return safeName;
    }

    public void setSafeName(String safeName) {
        this.safeName = safeName;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SafeRequest{" +
                "safeName='" + safeName + '\'' +
                ", folder='" + folder + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
