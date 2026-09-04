package app.e2c.service;

import app.e2c.entity.CategoryDomain;
import app.e2c.exception.NameUndefinedException;
import app.e2c.repository.CategoryDomainRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryDomainServiceTest {
    @Mock
    private CategoryDomainRepository categoryDomainRepository;

    @InjectMocks
    private CategoryDomainService categoryDomainService;

    @Test
    void createCategoryDomainWithNullNameTest(){
        CategoryDomain categoryDomain = new CategoryDomain();
        categoryDomain.setName(null);
        assertThatThrownBy(()->categoryDomainService.createDomain(categoryDomain)).isInstanceOf(NameUndefinedException.class);

    }

    @Test
    void createCategoryDomainWithNameTest(){
        CategoryDomain categoryDomain = new CategoryDomain();
        categoryDomain.setName("FASHION");
        when(categoryDomainRepository.save(categoryDomain)).thenReturn(categoryDomain);
        CategoryDomain result = categoryDomainService.createDomain(categoryDomain);
        assertThat(result).isEqualTo(categoryDomain);
        verify(categoryDomainRepository).save(categoryDomain);
    }
}
