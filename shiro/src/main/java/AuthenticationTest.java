import com.wmyskxz.demo.realm.MyRealm;
import com.wmyskxz.demo.realm.entity.Student;
import com.wmyskxz.demo.realm.entity.StudentVo;
import com.wmyskxz.demo.realm.es6.Array;
import com.wmyskxz.demo.realm.lwh_heheda.console;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class AuthenticationTest {

    @Test
    public void testAuthentication() {

        MyRealm myRealm = new MyRealm(); // 实现自己的 Realm 实例

        // 1.构建SecurityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(myRealm);

        // 2.主体提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager); // 设置SecurityManager环境
        Subject subject = SecurityUtils.getSubject(); // 获取当前主体

        UsernamePasswordToken token = new UsernamePasswordToken("wmyskxz", "123456");
        subject.login(token); // 登录

        // subject.isAuthenticated()方法返回一个boolean值,用于判断用户是否认证成功
        System.out.println("isAuthenticated:" + subject.isAuthenticated()); // 输出true
        // 判断subject是否具有admin和user两个角色权限,如没有则会报错
        subject.checkRoles("admin", "user");
//        subject.checkRole("xxx"); // 报错
        // 判断subject是否具有user:add权限
        subject.checkPermission("user:add");
    }


    @Test
    public void wunai() {


        Array array = new Array();
        array.add("1asd");
        array.add("2asdasd");
        array.add("3dsfdsf");

        Array<Student> array2 = new Array();

        array2.push(new Student(123, "1asdsad", 123));
        array2.push(new Student(123, "2asdsad", 123));
        array2.push(new Student(123, "3asdsad", 123));
        array2.push(new Student(123, "4asdsad", 123));
        array2.push(new Student(12312, "5asdsad", 123));

        array2.each(r-> console.log(r));

        // int number, String name, int score, String gradeName
        Array<StudentVo> asdad = array2.map((a, b, c) -> new StudentVo(a.getNumber(), a.getName(), a.getScore(), "asdad"));
        for (StudentVo studentVo : asdad) {
            System.out.println(studentVo.toString());
        }

    }


    @Test
    public void wunai2() {


        Array array = new Array();

        array.push("a");
        array.push("b");
        array.push("c");
        array.push("d");

        array.each(r->console.log(r));


    }


    @Test
    public void wunai3() {


        Array<Integer> arr = new Array();

        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);

        boolean some = arr.some(r -> r > 2);
    
        console.log(some);

    }
}