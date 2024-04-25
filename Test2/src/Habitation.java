public abstract class Habitation {
    private String address;

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Habitation habitation = (Habitation) obj;
        return this.address.equals(habitation.address);
    }

    public abstract void acheter();
}
