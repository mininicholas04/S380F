package hkmu.comps380f.onlinecoursewebsite.service;

import hkmu.comps380f.onlinecoursewebsite.dao.AttachmentRepository;
import hkmu.comps380f.onlinecoursewebsite.model.Attachment;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AttachmentService {
    @Resource
    private AttachmentRepository attachmentRepo;

    @Transactional
    public Attachment getAttachment(long id, String name) {
        return attachmentRepo.findByLectureIdAndName(id, name);
    }
}
