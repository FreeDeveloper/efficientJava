package cn.smile.basic;

import org.junit.Test;
/**
 *
 * sharedLocation.setCity(messageInfo.getCity().intern());
 * sharedLocation.setCountryCode(messageInfo.getRegion().intern());
 * sharedLocation.setRegion(messageInfo.getCountryCode().intern());
 *就是使用 String.intern 来节省内存空间，从而优化 String 对象的存储。
 * 具体做法就是，在每次赋值的时候使用 String 的 intern 方法，如果常量池中有相同值，就会重复使用该对象，返回对象引用，
 * 这样一开始的对象就可以被回收掉。这种方式可以使重复性非常高的地址信息存储大小从 20G 降到几百兆。
 *
 * */
public class EfficientStringTest {

    @Test
    public void internTest(){
        String str1= "abc";
        String str2= new String("abc");
        String str3= str2.intern();

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);
    }
}
