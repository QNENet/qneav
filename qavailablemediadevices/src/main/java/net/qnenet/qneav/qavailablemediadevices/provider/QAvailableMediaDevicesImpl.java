package net.qnenet.qneav.qavailablemediadevices.provider;

import net.qnenet.qneav.qavailablemediadevices.api.QAvailableMediaDevices;
import org.jitsi.service.libjitsi.LibJitsi;
import org.jitsi.service.neomedia.MediaService;
import org.jitsi.service.neomedia.MediaUseCase;
import org.jitsi.service.neomedia.device.MediaDevice;
import org.jitsi.service.neomedia.device.ScreenDevice;
import org.jitsi.utils.MediaType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Component(immediate = true)
public class QAvailableMediaDevicesImpl implements QAvailableMediaDevices {
    static Logger log = LoggerFactory.getLogger(QAvailableMediaDevicesImpl.class);

    @Activate
    public void activate() {

        MediaService mediaService = LibJitsi.getMediaService();

        List<ScreenDevice> screenDevices = mediaService.getAvailableScreenDevices();

        List<MediaDevice> videoMediaDevices = mediaService.getDevices(MediaType.VIDEO, MediaUseCase.CALL);



        log.info("Hello from -> " + getClass().getSimpleName());
    }

    @Deactivate
    public void deactivate() {
        log.info("Goodbye from -> " + getClass().getSimpleName());
    }

}
