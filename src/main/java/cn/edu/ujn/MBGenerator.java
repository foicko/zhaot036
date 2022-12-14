package cn.edu.ujn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class MBGenerator {

	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			String cfile = "/Context/generatorConfig.xml";
			File configFile = new File(Objects.requireNonNull(MBGenerator.class.getResource(cfile)).getFile());
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
			System.out.println("生成结束！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
