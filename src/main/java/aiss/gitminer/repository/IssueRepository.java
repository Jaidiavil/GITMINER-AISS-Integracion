package aiss.gitminer.repository;

import aiss.gitminer.model.Comment;
import aiss.gitminer.model.Issue;
import aiss.gitminer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<Issue, String> {


    List<Issue> findIssuesByAuthorIdAndState(String authorId, String state);
    List<Issue> findIssuesByAuthorId(String authorId);
    List<Issue> findIssuesByState(String state);
}