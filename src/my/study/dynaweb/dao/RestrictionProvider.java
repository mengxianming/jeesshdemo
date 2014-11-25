package my.study.dynaweb.dao;
import org.hibernate.Criteria;

public interface RestrictionProvider {
	void addRestriction(Criteria criteria);
}