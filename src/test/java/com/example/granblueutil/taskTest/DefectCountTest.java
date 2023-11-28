//package com.example.granblueutil.taskTest;
//
//import cn.hutool.core.io.FileUtil;
//import cn.hutool.core.lang.Tuple;
//import com.alibaba.fastjson2.JSON;
//import com.alibaba.fastjson2.JSONObject;
//import org.junit.jupiter.api.Test;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.math.BigDecimal;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DefectCountTest {
//	@Test
//	public void test() {
//		List<DefectLevelCount> list = new ArrayList<DefectLevelCount>();
//		DefectLevelCount dlc = new DefectLevelCount();
//		dlc.setCount(10);
//		dlc.setLevel(1);
//		dlc.setLevelName("levelName1");
//		DefectRecordResultUse todo1 = new DefectRecordResultUse();
//		todo1.setDefectId("123");
//		todo1.setContent("ok");
//		List<DefectRecordDetail> detailList = new ArrayList<>();
//		DefectRecordDetail detail = new DefectRecordDetail();
//		detail.setContent("content of detail");
//		detailList.add(detail);
//		detailList.add(detail);
//		todo1.setDetailList(detailList);
//
//		dlc.setTodo(new ArrayList<>() {{
//			add(todo1);
//			add(new DefectRecordResultUse());
//		}});
//		dlc.setLately(new ArrayList<>() {{
//			add(new DefectRecordResultUse());
//			add(todo1);
//		}});
//		list.add(dlc);
//		list.add(dlc);
//		Object obj=new BaseResult(list).getData();
//		List<?> list2=null;
//		if(obj instanceof List<?>){
//			list2= (List<?>) obj;
//		}else{
//			System.out.println("failed");
//		}
//		String jsonStr = JSON.toJSONString(list2);
//		try {
//			String defectCountFilePath="C:\\Projects\\java\\GranBlueUtil\\data/////////1";
//			String filePath=defectCountFilePath;
//			if(!defectCountFilePath.endsWith(File.separator)){
//				filePath+=File.separator;
//			}
//			filePath+="1.dat";
////			File file = new File("C:\\Projects\\java\\GranBlueUtil\\data\\1.dat");
////			FileWriter fw = new FileWriter(file);
//			FileUtil.writeString(jsonStr,filePath, StandardCharsets.UTF_8);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void test2(){
//		JSONObject obj=new JSONObject();
//		System.out.println(obj.get("key"));
//	}
//
//	public Tuple testTuple(){
//		Tuple tuple=new cn.hutool.core.lang.Tuple("123",1,true);
//		System.out.println(tuple.get(0).getClass());
//		System.out.println(tuple.get(1).getClass());
//		System.out.println(tuple.get(2).getClass());
//		return tuple;
//	}
//
//	@Test
//	public void test3(){
//		Tuple tuple=testTuple();
//		System.out.println(tuple.get(0).getClass());
//		String str=tuple.get(0);
//		System.out.println(str);
//	}
//
////	@Test
////	public void test4(){
////		long tmp=;
////		new BigDecimal((String)(Object)tmp);
////	}
//
//
//}
