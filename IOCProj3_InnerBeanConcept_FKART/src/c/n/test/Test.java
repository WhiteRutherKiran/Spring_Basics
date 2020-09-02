package c.n.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import c.n.target.FlipKart;
import c.n.target.Kiran;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext parentctx = new ClassPathXmlApplicationContext();
		FlipKart fkp = new FlipKart();
		//fkp = parentctx.getBean("fkp",FlipKart.class);
		//ApplicationContext childctx = new ClassPathXmlApplicationContext(("c/n/cfgs/applicationContext1.xml"),parentctx);
		Kiran krn = new Kiran();
		//krn = childctx.getBean("krn",Kiran.class);
		
		BeanFactory pf=new XmlBeanFactory(new FileSystemResource("src/c/n/cfgs/applicationContext.xml"));
		BeanFactory cf=new XmlBeanFactory(new FileSystemResource("src/c/n/cfgs/applicationContext1.xml"),pf);
		fkp = pf.getBean("fkp",FlipKart.class);
		krn = cf.getBean("krn",Kiran.class);
		
		String bmg=fkp.purchase(new String[] {"shirt","pant","acp"});
		System.out.println(bmg);
		System.out.println("=====================");
		String bmg1=krn.purchase(new String[] {"shirt","pant","acp"});
		System.out.println(bmg1);
		}

	}


