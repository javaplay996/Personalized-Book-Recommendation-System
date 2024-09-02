
package zwz.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import zwz.entity.ConfigEntity;
import zwz.utils.PageUtils;


/**
 * 系统用户
 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params);
}
