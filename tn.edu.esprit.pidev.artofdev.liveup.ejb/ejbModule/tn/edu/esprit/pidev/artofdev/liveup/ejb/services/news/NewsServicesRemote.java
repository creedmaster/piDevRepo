package tn.edu.esprit.pidev.artofdev.liveup.ejb.services.news;

import java.util.List;

import tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences.News;

public interface NewsServicesRemote {
	public void createNews(News news);
	public void updateNews(News news);
	public void deleteNews(News news);
	public News findNewsById(int idNews);
	public List<News> findAllNews();

}
