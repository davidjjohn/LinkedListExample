// Exciting class
//
// David John
// October, 2020


public class fruit {

    private String fruitname;
    private String fruitcolor;
    private int fruitsize;

    // alternate constructor
    public fruit(String myfn, String myfc, int myfs){
        fruitname = myfn;
        fruitcolor = myfc;
        fruitsize = myfs;
    }

    // does the String parameter match the fruitname
    public boolean fruitmatch(String name){
        return (name.equals(fruitname));
    }

    @Override
    public String toString(){
        return fruitname + " " + fruitcolor +  " " +fruitsize;
    }


}
