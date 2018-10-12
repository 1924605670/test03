package dto;

import lombok.*;

/**
 * @Author chengzhihua
 * @Date 2018/7/23 19:21
 */
@Data
@Builder
public class TestDto {
    @NonNull
    private String name;
    private int age;
}
