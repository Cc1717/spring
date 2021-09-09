package cn.cxw.study.spring2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages = "cn.cxw.study.spring2.config",
		includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, value = MyTypeFilter.class),
		useDefaultFilters = false
)
// MyConfig的bean一定会有！
public class MyConfig {

}

class Student {
	private int age;

	public Student() {
		this.age = 1717;
	}
}

class MyTypeFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		return true;
	}
}
