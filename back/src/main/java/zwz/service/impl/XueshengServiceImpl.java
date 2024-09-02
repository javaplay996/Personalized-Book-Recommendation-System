package zwz.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import zwz.utils.PageUtils;
import zwz.utils.Query;


import zwz.dao.XueshengDao;
import zwz.entity.XueshengEntity;
import zwz.service.XueshengService;
import zwz.entity.vo.XueshengVO;
import zwz.entity.view.XueshengView;

@Service("xueshengService")
public class XueshengServiceImpl extends ServiceImpl<XueshengDao, XueshengEntity> implements XueshengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengEntity> page = this.selectPage(
                new Query<XueshengEntity>(params).getPage(),
                new EntityWrapper<XueshengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengEntity> wrapper) {
		  Page<XueshengView> page =new Query<XueshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengVO selectVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengView selectView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
