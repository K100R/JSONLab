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
        String safeName = "PRV_PACHOLSKI";
        String folder = "Root";
        String account = "pacholski";
        String password = "ADpass1234$";
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
}
