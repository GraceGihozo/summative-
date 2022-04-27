//Can a class implement multiple interfaces? justify your answer.
// Answer YES because The class can only extend one other class in Java, but it can implement multiple interfaces.

// first interface
interface fly{
    void showfly();
}
// second interface
interface walk{
    void showwalk();
}
// third interface
interface glide{
    void showglide();
}

public class Owls implements fly,walk,glide {
	public static void main(String[] args){
		Owls st = new Owls();
        st.showfly();
        st.showwalk();
        st.showglide();
    }
    @Override
    public void showfly() {
        System.out.println("Owl is flying");
    }
    @Override
    public void showwalk() {
        System.out.println("Owl is walking");
    }
    @Override
    public void showglide() {
        System.out.println("Owl is gliding");
    }
}


