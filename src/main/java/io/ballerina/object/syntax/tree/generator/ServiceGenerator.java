package io.ballerina.object.syntax.tree.generator;

import io.ballerina.compiler.syntax.tree.ModuleMemberDeclarationNode;
import io.ballerina.object.model.BallerinaPackage;

import java.util.List;
import java.util.Map;

public class ServiceGenerator {

    public ModuleMemberDeclarationNode generateService(BallerinaPackage.Service service) {
        List<BallerinaPackage.Listener> listeners = service.listeners();
        for (BallerinaPackage.Listener listener : listeners) {
            String type = listener.type();
            if (!type.startsWith("http")) {
                continue;
            }
            if (listener.config() != null) {
                Map<String, String> config = listener.config();
                Object port = config.get("port");

            }
        }
        return Utils.getServiceDeclarationNode(service);
    }
}
