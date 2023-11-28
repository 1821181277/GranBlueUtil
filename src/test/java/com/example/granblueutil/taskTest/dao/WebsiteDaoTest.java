//package com.example.granblueutil.taskTest.dao;
//
//import com.example.granblueutil.po.Comment;
//import com.example.granblueutil.po.TestNode;
//import com.example.granblueutil.po.Website;
//import com.example.granblueutil.dao.CommentDao;
//import com.example.granblueutil.dao.TestNodeDao;
//import com.example.granblueutil.dao.WebsiteDao;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class WebsiteDaoTest {
//    @Autowired
//    WebsiteDao websiteDao;
//
//    @Autowired
//    CommentDao commentDao;
//    @Autowired
//    TestNodeDao testNodeDao;
//    @Test
//    public void test01(){
////        Website site=new Website();
//        Website site=websiteDao.getWebsiteById(1L);
//        site.setLikes(0);
//        site.setWebSiteName("碧蓝幻想");
//        site.setWebSiteUrl("https://game.granbluefantasy.jp/测试中文");
//        site.setDescription("非常好网站，女孩在里面很漂亮，爱来自瓷器");
//        websiteDao.save(site);
//        System.out.println(site.getId());
//    }
//
//    @Test
//    public void test02(){
//        Comment comment=new Comment();
//        comment.setWebsiteId(1L);
//        comment.setLikes(2);
//        comment.setContent("非常好网站，爱来自新加坡");
//        commentDao.save(comment);
//    }
//
//    @Test
//    public void test03(){
////        TestNode node=new TestNode();
////        node.setContent("this is my hate");
////        testNodeDao.saveAndFlush(node);
////        node.setParentId(3L);
////        testNodeDao.saveAndFlush(node);
//
//        List<TestNode> nodes=testNodeDao.queryModeRecordDetailsByStartTimeEndTimeKeyWordStIdTypeAndStatus("hate");
//        System.out.println(nodes);
//    }
//}
