package com.luban.imports;

import com.luban.dao.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 21:58:00
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao3.class.getName()};
	}
}
