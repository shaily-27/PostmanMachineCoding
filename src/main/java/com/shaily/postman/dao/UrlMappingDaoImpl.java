package com.shaily.postman.dao;

import com.shaily.postman.countingStrategy.UniqueIds;
import com.shaily.postman.entity.UrlMapping;
import com.shaily.postman.exception.DataStoreException;
import com.shaily.postman.repository.UrlMappingRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Timestamp;
import java.util.Optional;

@Log4j2
public class UrlMappingDaoImpl implements UrlMappingDao {

    @Autowired
    private UrlMappingRepo urlMapping;

    @Autowired
    private UniqueIds uniqueIds;

    public String addUrlToDb(String longUrl, int id) {

        try {
            Optional<UrlMapping> isAlreadyPresent = urlMapping.findById(longUrl);
            if(isAlreadyPresent.isPresent()) {
                return isAlreadyPresent.get().getShortUrl();
            } else {
                String shortUrl = Base62Codec.INSTANCE.encode(uniqueIds);
                urlMapping.save(UrlMapping.builder().longUrl(longUrl).Id(uniqueIds).shortUrl(shortUrl).creationTime(Timestamp.class).build());
            }
        } catch (DataStoreException e) {
            // log
        }

    }

    public String getUrlFromDb(String shortUrl) {
        //
    }

}
