package com.cp.testfabric.timetest;

import com.cp.testfabric.mapper.FabricMapper;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DBTest {
    
    @Autowired
    private FabricMapper mapper;


    @Test
    public void timeTest(){
        mapper.timeSelect();
    }

    // 테이블명 tbl_fabric
    // 본격 테스트
    // 1. insert 테스트
    // 안됨
    // @Test
    // public void insertTest(){
        
    //     FabricVO vo = FabricVO.builder().json("{'version':'3.6.1','objects':[{'type':'text','version':'3.6.1','originX':'left','originY':'top','left':0,'top':0,'width':249.94,'height':45.2,'fill':'rgb(0,0,0)','stroke':null,'strokeWidth':1,'strokeDashArray':null,'strokeLineCap':'butt','strokeDashOffset':0,'strokeLineJoin':'miter','strokeMiterLimit':4,'scaleX':1,'scaleY':1,'angle':0,'flipX':false,'flipY':false,'opacity':1,'shadow':null,'visible':true,'clipTo':null,'backgroundColor':'','fillRule':'nonzero','paintFirst':'fill','globalCompositeOperation':'source-over','transformMatrix':null,'skewX':0,'skewY':0,'text':'Mamba Rules!!','fontSize':40,'fontWeight':'normal','fontFamily':'Times New Roman','fontStyle':'normal','lineHeight':1.16,'underline':false,'overline':false,'linethrough':false,'textAlign':'left','textBackgroundColor':'','charSpacing':0,'styles':{}},{'type':'image','version':'3.6.1','originX':'left','originY':'top','left':200,'top':0,'width':271,'height':320,'fill':'rgb(0,0,0)','stroke':null,'strokeWidth':0,'strokeDashArray':null,'strokeLineCap':'butt','strokeDashOffset':0,'strokeLineJoin':'miter','strokeMiterLimit':4,'scaleX':0.63,'scaleY':0.63,'angle':0,'flipX':false,'flipY':false,'opacity':1,'shadow':null,'visible':true,'clipTo':null,'backgroundColor':'','fillRule':'nonzero','paintFirst':'fill','globalCompositeOperation':'source-over','transformMatrix':null,'skewX':0,'skewY':0,'crossOrigin':'','cropX':0,'cropY':0,'src':'http://localhost:8080/img/mickey.png','filters':[]}]}{'version':'3.6.1','objects':[{'type':'text','version':'3.6.1','originX':'left','originY':'top','left':0,'top':0,'width':249.94,'height':45.2,'fill':'rgb(0,0,0)','stroke':null,'strokeWidth':1,'strokeDashArray':null,'strokeLineCap':'butt','strokeDashOffset':0,'strokeLineJoin':'miter','strokeMiterLimit':4,'scaleX':1,'scaleY':1,'angle':0,'flipX':false,'flipY':false,'opacity':1,'shadow':null,'visible':true,'clipTo':null,'backgroundColor':'','fillRule':'nonzero','paintFirst':'fill','globalCompositeOperation':'source-over','transformMatrix':null,'skewX':0,'skewY':0,'text':'Mamba Rules!!','fontSize':40,'fontWeight':'normal','fontFamily':'Times New Roman','fontStyle':'normal','lineHeight':1.16,'underline':false,'overline':false,'linethrough':false,'textAlign':'left','textBackgroundColor':'','charSpacing':0,'styles':{}},{'type':'image','version':'3.6.1','originX':'left','originY':'top','left':200,'top':0,'width':271,'height':320,'fill':'rgb(0,0,0)','stroke':null,'strokeWidth':0,'strokeDashArray':null,'strokeLineCap':'butt','strokeDashOffset':0,'strokeLineJoin':'miter','strokeMiterLimit':4,'scaleX':0.63,'scaleY':0.63,'angle':0,'flipX':false,'flipY':false,'opacity':1,'shadow':null,'visible':true,'clipTo':null,'backgroundColor':'','fillRule':'nonzero','paintFirst':'fill','globalCompositeOperation':'source-over','transformMatrix':null,'skewX':0,'skewY':0,'crossOrigin':'','cropX':0,'cropY':0,'src':'http://localhost:8080/img/mickey.png','filters':[]}]}").build();
		
	// 	log.info(mapper.insert(vo));
    // }

    //2. select 테스트
    //total은 1인데 null로 나온다
    // @Test
    // public void selectTest(){

    //     log.info(mapper.select(1L) );

    // }

}