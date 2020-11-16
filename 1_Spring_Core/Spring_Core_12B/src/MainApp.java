import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import test.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource r = new ClassPathResource("Beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Student s = (Student) factory.getBean("proxy", Student.class);
		s.getName();
	}

}
