package zwz.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import zwz.utils.PageUtils;
import zwz.entity.DiscusstushuxinxiEntity;
import java.util.List;
import java.util.Map;
import zwz.entity.vo.DiscusstushuxinxiVO;
import org.apache.ibatis.annotations.Param;
import zwz.entity.view.DiscusstushuxinxiView;


/**
 * 图书信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
public interface DiscusstushuxinxiService extends IService<DiscusstushuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstushuxinxiVO> selectListVO(Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	DiscusstushuxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	List<DiscusstushuxinxiView> selectListView(Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	DiscusstushuxinxiView selectView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstushuxinxiEntity> wrapper);
   	
}

