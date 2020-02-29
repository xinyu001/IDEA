package 内部类;

import java.text.Bidi;

/**
 * 复习内部类
 * 内访问外边随意访问
 * 外访问内部需要有内部的对象
 */
public class Body {

    public class Heart{
        //内部类的方法
        public void hert(){
            System.out.println("心脏跳动");
            System.out.println("小心脏");
        }
    }
    private String name = "小心脏";

    public void test(){
        new Heart().hert();
    }
    public static void main(String[] args) {
        //直接调用内部类 [方式外点内]
        Body.Heart heart = new Body().new Heart();

        heart.hert();

        System.out.println("========================");
        //间接访问，通过外部类的方法去访问
        new Body().test();
    }
}
