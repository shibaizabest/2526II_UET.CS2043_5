public class PartFour implements Prototype{
    private String id;

    public PartFour(PartFour obj){
        this.id = obj.getId();
    }

    public PartFour(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public PartFour clone(){
        return new PartFour(this);
    }
}
