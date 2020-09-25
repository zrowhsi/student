package np.com.ishworb.student.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public abstract class AbstractEntity {
	
	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date created = new Date();

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModified;
}
