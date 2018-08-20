package com.ebc.demo;

import com.ebc.demo.VO.TUser;
import com.ebc.demo.dao.TUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.net.URL;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Transactional
@Rollback
public class DemoApplicationTests {

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void testSelect(){
        List<TUser> tUsers = tUserMapper.selectAll();

        for (TUser tUser : tUsers) {
            System.out.println(tUser.getId());
        }
    }

    @Test
    public void testPage(){
        PageHelper.startPage(1,3);

        Example example = new Example(TUser.class);
        PageInfo<TUser> pageInfo = new PageInfo<>(tUserMapper.selectByExample(example));
        List<TUser> list = pageInfo.getList();
        for (TUser tUser : list) {
            System.out.println(tUser.getId());
        }
    }

//    @LocalServerPort
//    private int port;
//
//    private URL base;
//
//    @Autowired
//    private TestRestTemplate template;
//
//    @Before
//    public void setUp() throws Exception {
//        this.base = new URL("http://localhost:" + port + "/hi");
//    }
//
//    @Test
//    public void contextLoads() {
//        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
//        assertThat(response.getBody(), equalTo("Hello, World!"));
//    }


}
