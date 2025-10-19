package com.mapalad.ecommerce.services.admin.faq;

import com.mapalad.ecommerce.dto.FAQDto;

public interface FAQService {

    FAQDto postFAQ(Long productId, FAQDto faqDto);
}
