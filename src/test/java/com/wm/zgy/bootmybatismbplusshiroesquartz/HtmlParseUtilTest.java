package com.wm.zgy.bootmybatismbplusshiroesquartz;

import com.wm.zgy.bootmybatismbplusshiroesquartz.service.ContentService;
import com.wm.zgy.bootmybatismbplusshiroesquartz.utils.HtmlParseUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/5/23 1:34
 * @Modified by:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HtmlParseUtilTest {
    @Autowired
    private ContentService contentService;

    @Test
    public void testParseJd() throws IOException {
        HtmlParseUtil htmlParseUtil = new HtmlParseUtil();
        System.out.println(htmlParseUtil.parseJd("vue"));
    }

    @Test
    public void testParseContentAdd2Es() throws Exception {
        boolean status = contentService.parseContentAdd2Es("java");
        System.out.println(status);
    }

    @Test
    public void testSearchContentWithPage() throws Exception {
        List<Map<String, Object>> javaBooks = contentService.searchContentWithPage("java", 1, 10);
        System.out.println(javaBooks);
    }

}
