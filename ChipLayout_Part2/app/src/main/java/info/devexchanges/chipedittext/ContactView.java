package info.devexchanges.chipedittext;

public class ContactView {
    private int drawableId;
    private String name;
    private String email;

    public ContactView(int drawableId, String name, String email) {
        this.drawableId = drawableId;
        this.name = name;
        this.email = email;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
