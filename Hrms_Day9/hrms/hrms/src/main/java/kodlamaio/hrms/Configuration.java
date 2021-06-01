package kodlamaio.hrms;

import org.springframework.context.annotation.Bean;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.imageUpload.CloudinaryManager;
import kodlamaio.hrms.core.utilities.imageUpload.ImageService;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public ImageService imageService() {
		return new CloudinaryManager(cloudinary());
	}
	
	@Bean
	public Cloudinary cloudinary() {
		return new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dcwqoenws",
				"api_key", "833915756341162",
				"api_secret", "35QWFUrs8U7-nOoUjQNO3QKpTpk"));
	}
}
