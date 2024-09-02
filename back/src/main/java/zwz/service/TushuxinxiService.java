package zwz.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import zwz.utils.PageUtils;
import zwz.entity.TushuxinxiEntity;
import java.util.List;
import java.util.Map;
import zwz.entity.vo.TushuxinxiVO;
import org.apache.ibatis.annotations.Param;
import zwz.entity.view.TushuxinxiView;


/**
 * 图书信息
 *
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
public interface TushuxinxiService extends IService<TushuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuxinxiVO> selectListVO(Wrapper<TushuxinxiEntity> wrapper);
   	
   	TushuxinxiVO selectVO(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
   	
   	List<TushuxinxiView> selectListView(Wrapper<TushuxinxiEntity> wrapper);
   	
   	TushuxinxiView selectView(@Param("ew") Wrapper<TushuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuxinxiEntity> wrapper);
   	
}

