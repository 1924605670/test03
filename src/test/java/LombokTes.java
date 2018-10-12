import dto.TestDto;
import org.junit.Test;

/**
 * @Author chengzhihua
 * @Date 2018/7/23 19:22
 */
public class LombokTes {
    @Test
    public void fun1(){
        TestDto testDto = TestDto.builder().age(2).name("name")
                .build();
        System.out.println(testDto.toString());
    }
}
