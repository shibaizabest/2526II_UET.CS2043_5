public class Shortcut extends FileSystemItem{
    private FileSystemItem target;

    public Shortcut(String name, FileSystemItem target){
        this.name = name;
        this.target = target;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Shortcut: " +name + " -> " + target.getPath());
    }
//    private FileSystemItem target;
}
