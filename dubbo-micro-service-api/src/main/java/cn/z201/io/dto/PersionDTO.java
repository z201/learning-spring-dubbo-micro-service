package cn.z201.io.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author z201.coding@gmail.com
 **/
@Data
public class PersionDTO implements Serializable {

    private String name;

    private Timestamp time;

    public PersionDTO(String name, Timestamp time) {
        this.name = name;
        this.time = time;
    }
}
