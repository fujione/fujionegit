package cn.itcast;

public class Fu {
    private void show(){
        System.out.println("private");
    }

    void show2(){
        System.out.println("默认");
    }

    protected void show3(){
        System.out.println("protected");
    }

    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.show();
        fu.show2();
        fu.show3();
        fu.show4();
    }
}
