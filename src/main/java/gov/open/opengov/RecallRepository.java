package gov.open.opengov;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface RecallRepository extends ElasticsearchRepository<Recall,String>{
  Recall[] getRecalls();
    

}