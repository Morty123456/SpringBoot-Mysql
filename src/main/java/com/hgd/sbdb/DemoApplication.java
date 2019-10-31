package com.hgd.sbdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描Mapper，不用再在每个mapper上单独添加mapper注解,路径就是mapper文件夹
@MapperScan("com.hgd.sbdb.mapper")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
