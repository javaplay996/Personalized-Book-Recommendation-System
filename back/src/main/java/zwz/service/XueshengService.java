package zwz.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import zwz.utils.PageUtils;
import zwz.entity.XueshengEntity;
import java.util.List;
import java.util.Map;
import zwz.entity.vo.XueshengVO;
import org.apache.ibatis.annotations.Param;
import zwz.entity.view.XueshengView;


/**
 * 学生
 *
 * @author 
 * @email 
 * @date 2021-03-05 14:09:23
 */
public interface XueshengService extends IService<XueshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengVO selectVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper);
   	
   	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengEntity> wrapper);
   	
}

