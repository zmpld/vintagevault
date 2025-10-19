package com.mapalad.ecommerce.services.admin.faq;

import com.mapalad.ecommerce.dto.FAQDto;
import com.mapalad.ecommerce.entity.FAQ;
import com.mapalad.ecommerce.entity.Product;
import com.mapalad.ecommerce.repository.FAQRepository;
import com.mapalad.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class FAQServiceImpl implements FAQService {

    private final FAQRepository faqRepository;
    private final ProductRepository productRepository;

    public FAQDto postFAQ(Long productId, FAQDto faqDto) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            FAQ faq = new FAQ();

            faq.setQuestion(faqDto.getQuestion());
            faq.setAnswer(faqDto.getAnswer());
            faq.setProduct(optionalProduct.get());

            return faqRepository.save(faq).getFAQDto();

        }
        return null;
    }

    public FAQServiceImpl(FAQRepository faqRepository, ProductRepository productRepository) {
        this.faqRepository = faqRepository;
        this.productRepository = productRepository;
    }
}
