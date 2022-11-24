// Generated by Dagger (https://dagger.dev).
package ui.news;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import data.repository.NewsRepository;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  public NewsViewModel_Factory(Provider<NewsRepository> newsRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(newsRepositoryProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<NewsRepository> newsRepositoryProvider) {
    return new NewsViewModel_Factory(newsRepositoryProvider);
  }

  public static NewsViewModel newInstance(NewsRepository newsRepository) {
    return new NewsViewModel(newsRepository);
  }
}
