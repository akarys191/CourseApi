package io.javabrains;

public class ThisReferenceExample {
    public void doProcess(int i, ClosuresExample.Process process){
        process.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println(" Value of i: "+i);
            System.out.println(this);
        });
    }

    public static void main(String[] args){
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println(" Value of i: "+i);
        //    System.out.println(this);
        });

        thisReferenceExample.execute();
    }
}
