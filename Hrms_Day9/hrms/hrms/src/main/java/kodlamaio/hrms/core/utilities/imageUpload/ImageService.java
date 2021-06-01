package kodlamaio.hrms.core.utilities.imageUpload;

import org.springframework.web.multipart.MultipartFile;
import kodlamaio.hrms.core.utilities.results.DataResult;
import java.util.Map;

public interface ImageService {
	DataResult<Map> save(MultipartFile file);
}
